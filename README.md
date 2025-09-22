# FilehandlingT1
# Task1-
COMPANY : CODTECH IT SOLUTION
NAME : G.PAVANI
INTERN ID : CT6MTWN116
DOMAIN : JAVA DEVELOPER
DURATION : 6MONTHS
MENTOR : NEELA SANTHOSH
DESCRIPTION OF MY TASK(FILE HANDLING) ONE : The program FileHandling works with a text file Task1.txt in the D: drive and demonstrates three basic operations: writing, reading, and modifying (appending) file content
Methods and Their Uses :
writeFile(String fileName, String content)
Use: Writes new content 1!into the file.
Why: To store user input in the file (overwrites old content).
readFile(String fileName)
Use: Reads and displays the content of the file line by line.
Why: To check what data exists in the file after write/append.
modifyFile(String fileName, String newContent)
Use: Appends new content to the existing file without deleting old data.
Why: To update the file while preserving previous information.
1)Program start & file path
String fileName = "D:\\Task1.txt";
2)Getting user input You use Scanner sc = new Scanner(System.in); and sc.nextLine() to read lines typed by the user.
3)writeFile(String fileName, String content) :opens the file and writes content, replacing any previous contents.
4)FileWriter:FileWriter is a simple writer class for writing character data to text files.
5)readFile(String fileName) : opens the file and reads it line by line using a BufferedReader.FileReader reads characters from the file.BufferedReader wraps it to provide readLine() and more efficient reading (reduces I/O calls).
6)modifyFile(String fileName, String newContent) : adds new text to the end of the file without deleting existing data.FileWriter(..., true):The second boolean parameter true enables append mode. Without it, FileWriter would overwrite.

Conclusion : We use separate methods (writeFile, readFile, modifyFile)
Clarity: each method handles one responsibility (Single Responsibility Principle).
Reusability: you can call these methods from other programs or tests easily.
Maintainability: fixes or enhancements to reading/writing are localized to one me
