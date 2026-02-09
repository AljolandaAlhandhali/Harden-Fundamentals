/*
Description:
Create a program that prints a file directory tree structure, showing folders and files with indentation.

Acceptance Criteria:
The output visually represents a directory tree with folders and files.
Indentation is used to show hierarchy.
No loops are required for this problem.
Solution can be written using multiple print statements if needed.

Expected Input/Output:
Output:
Root\
	Documents\
		resume.pdf
		letter.doc
	Photos\
		vacation.jpg
*/

public class TheTreeReveal {
    public static void main(String[] args) {
        System.out.print("Root\\\n");
        System.out.print("\tDocuments\\\n");
        System.out.print("\t\tresume.pdf\n");
        System.out.print("\t\tletter.doc\n");
        System.out.print("\tPhotos\\\n");
        System.out.print("\t\tvacation.jpg\n");
    }
}
