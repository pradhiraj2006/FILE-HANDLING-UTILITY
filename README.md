COMPANY: CODTECH IT SOLUTIONS

NAME: PRADHISHA R

INTERN ID: CTIS0953

DOMAINS: JAVA PROGRAMMING

DURATION: 4 WEEKS

MENTOR:NEELA SANTHOSH

#DESCRIPTION: The File Handling Utility Program in Java demonstrates how to perform fundamental operations on text files such as writing, reading, appending, and modifying data. File handling is a crucial aspect of software development because it enables long-term storage and retrieval of information. This program effectively showcases how Java uses classes from the java.io and java.nio.file packages to work with files in an efficient and structured manner.

Importing Required Packages To perform file operations, the program imports essential classes like BufferedWriter, BufferedReader, FileWriter, FileReader, Files, and Paths. These classes provide the ability to read and write textual data efficiently and form the backbone of Java’s file handling mechanism.

Writing to a File The writeToFile() method demonstrates how to create a new file or overwrite an existing one. It uses BufferedWriter wrapped around FileWriter to write content efficiently into the file. The method accepts the file name and the string to be written. This initial write operation ensures that the file is created with default content, thus preparing it for subsequent operations.

Reading from a File The readFile() method is responsible for reading and displaying the content of the file. It employs BufferedReader and FileReader to read data line by line. This is an efficient approach, especially for large text files, because it avoids loading the entire file into memory. The method prints the file’s content to the console to allow the user to verify changes made during the program execution.

Appending Content to a File The program allows adding new data without erasing the existing content through the appendToFile() method. By enabling append mode using new FileWriter(fileName, true), the program ensures that new data is added at the end of the file. This operation is commonly used in scenarios like log files, history trackers, or any system that needs to preserve previous data.

Modifying the File Content The modifyFile() method demonstrates how to update or replace specific parts of a file. It reads the complete file into a string using Files.readAllBytes() and then uses Java’s replace() function to substitute the target text with new content. Finally, it writes the updated text back into the same file. This approach efficiently modifies file content without manually rewriting line-by-line data.

Main Method Operations The main() method acts as the driver function and executes all file operations in a sequential manner. It begins by writing initial content to the file, then reads and displays it. Next, it appends new text to demonstrate the addition of content, modifies specific text within the file, and finally reads the updated file to show the final result. This organized structure helps visualize how each file operation affects the file.

*Conclusion This File Handling Utility Program provides a complete demonstration of file operations in Java. It highlights the use of both traditional I/O (FileReader, FileWriter) and modern NIO (Files, Paths) techniques. The program is practical, easy to understand, and useful for academic learning, especially for understanding how real applications store, update, and manage data. This File Handling Utility Program provides a complete demonstration of file operations in Java. It highlights the use of both traditional I/O (FileReader, FileWriter) and modern NIO (Files, Paths) techniques.

*OUTPUT:


