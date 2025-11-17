public class Pattern4 {
    public static void main(String[] args) {
        int n=5;
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <=n; col++) {
              if(col>=n-row+1)
              System.out.print("* "); 
              else
              System.out.print(" "); 
            }
        System.out.println(" ");// add new line 
        }
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <=n; col++) {
              if( col==4||col==5)
              System.out.print("*"); 
              else
              System.out.print(" "); 
            }
        System.out.println(" ");
    }
    for (int row = 1; row <= n; row++) {
            for (int col = 1; col <=n; col++) {
              if( col==4||col==5)
              System.out.print("*"); 
              else
              System.out.print(" "); 
            }
        System.out.println(" ");
    }
     for (int row = 1; row <= n; row++) {
            for (int col = 1; col <=n; col++) {
              if(col>=row)
              System.out.print(" *"); 
              else
              System.out.print(" "); 
            }
        System.out.println(" ");// add new line 
        }
    
}}

