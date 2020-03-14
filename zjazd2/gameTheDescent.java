/*Author: Joana Walkiewicz
 *SUMMARY:The Descent game from coding game implemented in Java.
 *Short bio: A simple problem to try out the CodinGame platform: your program must find the highest mountain out of a list of mountains
*/
class Player {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);

        while (true) {
            int cel=-1; 
            int nw=-1; 
            for (int i = 0; i < 8; i++) {
                int mountainH = in.nextInt();
                if(nw<mountainH) 
                {
                  nw=mountainH;
                  cel=i;
                    }
            }

            

            System.out.println(cel); 
        }
    }
}