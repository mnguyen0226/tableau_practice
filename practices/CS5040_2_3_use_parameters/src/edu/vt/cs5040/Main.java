package edu.vt.cs5040;

public class Main {
    /**
     * 
     * Class takes parameters and printout what each parameters do.
     * Note that I have set up Run > Run Configuration > Arguments > set up testing parameters.
     *
     * @param args
     */
    public static void main(String[] args) {
        int count = 0;
        
        // Check if there is no parameter
        if (args.length < 1) {
            System.out.println("There is no parameters!");
        }
        
        // Go thru each parameter and printout what it is
        while (count < args.length) {
            switch(args[count]) {
            case "-h":
                System.out.println("This is the help message. Proper command syntax:");
                System.out.println("cmdline -v: Displays version information");
                System.out.println("cmdline -h: Displays this help message");
                System.out.println("cmdline -f [file]: Sets file to file provided");
                count++;
            break;
            
            case "-v":
                System.out.println("Cmdline parse sample version 1.0.0");
                count++;
             break;
             
             case "-f":
                String fileName = args[count+1];
                System.out.println("Input file is "+fileName);
                count = count+2; //Increment counter to next item (skipping filename).
                //Note this provides no bounds checking so if you pass the parameter without file info it may bomb if at the end
                //You may also surround it in a try/catch for safety.
             break;
             
             default:
                System.out.println("Unrecognized parameter "+args[count]+"\nExiting.");
                System.exit(-1);              
             break;
            }
        }
    }
}
