: '
Create one script to achieve following requirement 

fetch all the files recursively from the specified directory Path in argument 
check if the file is xml then copy it in a directory named "xml" in the current directory. 
check if filename contains any special character rename it to only alphanumeric name (means remove all special character from fileName)
check which file contains emailAddress and list out all those file names in file named "EmailAddressFiles.txt" and those emailAddress in file named "EmailAddresses.txt" in current directory. 
& replace @gmail.com in all emailAddresses in all files with @axelor.com.
'

for file in *; do

	base_name=$(basename ${file})
	file_name=${base_name%.*}
	ext=${base_name#*.}
	f=${file_name//[^[:alnum:]]/}
	new_filename="$f.$ext"
	
	echo "base name : " $base_name
	
	if [ -f $file ] 
	then
		if [ $ext = "xml" ]
		then
			cp $file "xml/"$file
		else
			if [[ $file_name =~ ['!@#$ %^&*()_+'] ]]; then
				echo "$file is having special characters"
				mv $file  $f"."$ext
			fi			
		fi
		if grep -E -q "\b[a-zA-Z0-9.-]+@[a-zA-Z0-9.-]+.[a-zA-Z0-9.-]+\b" $new_filename
		then 
			echo "$new_filename has email address "
			grep -E -o "\b[a-zA-Z0-9.-]+@[a-zA-Z0-9.-]+.[a-zA-Z0-9.-]+\b" $new_filename >> "EmailAddresses.txt"
			echo "$new_filename" >> "EmailAddressesFile.txt"
			sed -i 's/gmail/axelor/gi' $new_filename
		fi
	fi
done
	
	
	
