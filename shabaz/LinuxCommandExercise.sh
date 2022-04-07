#!/bin/sh
 
path=/shabaz/
mkdir xml
for file in $path
do
mv *.xml xml/ 

rename 's/(@|~|#|%)//' *.txt
done
grep -l "@gmail.com" *.txt > EmailAddressFiles.txt
cat EmailAddressFiles.txt
grep -h "@gmail.com" *.txt > EmailAddresses.txt
cat EmailAddresses.txt
sed 's/@gmail.com/@axelor.com/' EmailAddresses.txt
