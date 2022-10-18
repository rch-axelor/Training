
: '
Create one script to achieve following requirement 

fetch all the files recursively from the specified directory Path in argument 
check if the file is xml then copy it in a directory named "xml" in the current directory. 
check if filename contains any special character rename it to only alphanumeric name (means remove all special character from fileName)
check which file contains emailAddress and list out all those file names in file named "EmailAddressFiles.txt" and those emailAddress in file named "EmailAddresses.txt" in current directory. 
& replace @gmail.com in all emailAddresses in all files with @axelor.com.
'
p=/home/axelor/Training/Task1
mkdir xml

for file in $p
do
	cp *.xml xml/

        rename -v '#' '' *.txt
	rename -v '@' '' *.txt
	rename -v '%' '' *.txt
	rename -v '$' '' *.txt
	rename -v '%' '' *.txt
	rename -v '^' '' *.txt
	rename -v '&' '' *.txt
	rename -v '*' '' *.txt


done

grep -l "@gmail.com" *.txt > EmailAddressFiles.txt

grep -h "@gmail.com" *.txt > EmailAddresses.txt

sed 's/@gmail.com/@axelor.com/' EmailAddresses.txt
