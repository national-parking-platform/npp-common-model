# This script is used to clean the automatically generated source from YAML and
# ensure each class is in the correct package related to the x-package tag

import sys
import os
import re

if len(sys.argv) == 3:

    origin_folder = sys.argv[1]
    destination_folder = sys.argv[2]

    # First build a list of class name to package for each source

    class_to_package = {}

    package_pattern = re.compile('^package (.*);$')

    for root, d_names, f_names in os.walk(origin_folder):

        for file in f_names:

            class_name = file.split('.')[0]

            with open(root + '/' + file) as current_file:

                package = ''

                for line in current_file.readlines():

                    matches = re.findall(package_pattern, line)

                    if len(matches) != 0:
                        package = matches[0]

                class_to_package[class_name] = package

    # Then for each source, fix the imports and move the file to the correct place

    import_pattern = re.compile('import (.*);')

    for root, d_names, f_names in os.walk(origin_folder):

        for file in f_names:

            with open(root + '/' + file) as current_file:

                class_name = file.split('.')[0]

                current_file_data = current_file.read()

                import_packages = re.findall(import_pattern, current_file_data)

                for import_package in import_packages:

                    package_class = import_package.split('.')[-1]

                    if package_class in class_to_package.keys():
                        current_file_data = current_file_data.replace(import_package + ';', '.'.join([class_to_package[package_class], package_class]) + ';')

                new_file_name = '/'.join([destination_folder, '/'.join(class_to_package[class_name].split('.')), file])

                print('Cleaning and migrating generated class ' + class_name + ' to ' + new_file_name)

                os.makedirs(os.path.dirname(new_file_name), exist_ok=True)

                with open(new_file_name, "w") as new_file:
                    new_file.write(current_file_data)

            os.remove(root + '/' + file)

else:

    print("Error while cleaning sources, number of arguments for the script is invalid.")



