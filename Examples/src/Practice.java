


public class Practice {
    public static void main(String[] args) {
                
        /*  
        
        * * * * * 
        * * * * * 
        * * * * * 
        * * * * * 
        * * * * * 
        
        */

        for(int i = 1; i <= 5; i++) {
            for(int j = 1; j <= 5; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        
        System.out.println("-------------------------------------");

                
        /*  
        
            *
           ***
          *****
         *******
        *********
        
        */
        
        for(int i = 1; i <= 5; i++) {
            for(int space = 1; space <= 5 - i; space++) {
                System.out.print(" ");
            }
            for(int star = 1; star <= (2 * i - 1); star++) {
                System.out.print("*");
            }
            System.out.println();
        }
        
        System.out.println("-------------------------------------");

        
        /*  
        
        *********
         *******
          *****
           ***
            *
            
        */
        
        for (int i = 5; i >= 1; i--) {
            for (int space = 1; space <= 5 - i; space++) {
                System.out.print(" ");
            }
            for (int star = 1; star <= (2 * i - 1); star++) {
                System.out.print("*");
            }
            System.out.println();
        }
                
        System.out.println("-------------------------------------");


        /*  
        
            *
           **
          ***
         ****
        *****
        
        */
        
        for(int i = 1; i <= 5; i++) {
            for(int space = 1; space <= 5 - i; space++) {
                System.out.print(" ");
            }
            for(int star = 1; star <= i; star++) {
                System.out.print("*");
            }
            System.out.println();
        }
               
        System.out.println("-------------------------------------");
        
        /*  
        
        *
        **
        ***
        ****
        *****
        
        */
        
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        
        System.out.println("-------------------------------------");

        /*  
        
        *****
        ****
        ***
        **
        *
        
        */
        
        for (int i = 5; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        
        System.out.println("-------------------------------------");


        /*  
        
        1	
        1	2	
        1	2	3	
        1	2	3	4	
        1	2	3	4	5	
                
        */
        
        for (int i = 1; i <= 5; i++) {
          for (int j = 1; j <= i; j++) {
              System.out.print(j + "\t");
          }
            System.out.println();
        }
        
        System.out.println("-------------------------------------");

        /*  
        
        1 2 3 4 5 
        1 2 3 4 5 
        1 2 3 4 5 
        1 2 3 4 5 
        1 2 3 4 5 
        
        */
        
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
        
        System.out.println("-------------------------------------");
        
        /*  
        
        1 2 3 4 5 
        1 2 3 4 
        1 2 3 
        1 2 
        1 
        
        */
        
        for (int i = 5; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
        

        System.out.println("-------------------------------------");

        /*  
        
        1
        121
        12321
        1234321
        123454321
        
        */
        
        for (int i = 1; i <= 5; i++) {
            // الأرقام تصاعدي
            for (int j = 1; j <= i; j++) {
                System.out.print(j + "\t");
            }
            // الأرقام تنازلي (بدون تكرار الرقم الأخير)
            for (int j = i - 1; j >= 1; j--) {
                System.out.print(j + "\t");
            }
            System.out.println();
        }
        
        
        System.out.println("-------------------------------------");
        
        /*
        
        2 
        2 4 
        2 4 6 
        2 4 6 8 
        2 4 6 8 10 
        
        */
        
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print((j * 2) + " ");
            }
            System.out.println();
        }
        
        System.out.println("-------------------------------------");
        
        /*
        
        1 
        1 3 
        1 3 5 
        1 3 5 7 
        1 3 5 7 9 
        
        */
        
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print((j * 2 - 1) + " ");
            }
            System.out.println();
        }
        
        System.out.println("-------------------------------------");

        String password = "my@password";
        if (password.length() > 8) {
            for (int i = 0; i < password.length(); i++) {
                char ch = password.charAt(i);
                if (ch == '@' || ch == '_' || ch == '-') {
                    System.out.println("Strong");
                }
            }
        } 
        else {
            System.out.println("Weak");
        }

        System.out.println("-------------------------------------");
        
        /*
        
        1 3 5 7 9 
        1 3 5 7 9 
        1 3 5 7 9 
        1 3 5 7 9 
        1 3 5 7 9 
        
        */
        
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 10; j = j + 2) {
                System.out.print((j) + " ");
            }
            System.out.println();
        }
        
        System.out.println("-------------------------------------");
        
        /*
        
        2 4 6 8 10 
        2 4 6 8 10 
        2 4 6 8 10 
        2 4 6 8 10 
        2 4 6 8 10 
        
        */
        
        for (int i = 1; i <= 5; i++) {
            for (int j = 2; j <= 10; j = j + 2) {
                System.out.print((j) + " ");
            }
            System.out.println();
        }

        
        System.out.println("-------------------------------------");

    }
}
