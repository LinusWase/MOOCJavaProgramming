# Records From a File

In this exercise, we'll be working with files stored in CSV-format that contain names and ages separated by commas. The file format may look like this:

<pre>
lily,3
anton,5
levi,4
amy,1
</pre>

Your task is to write a program that first prompts the user for the name of the file they want to read. The program then prints the content of the file in the following way (we're assuming below that the output is from the above-mentioned file):

<pre>
Name of the file:
data.txt
lily, age: 3 years
anton, age: 5 years
levi, age: 4 years
amy, age: 1 year
</pre>

__NB!__ The word "year" should be formatted based on the age.