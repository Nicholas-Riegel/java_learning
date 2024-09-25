// enum is a class
enum Status 
{
    Success, Failed, Pending, Running // these are objects
}

public class Program {

    public static void main(String[] args)
    {
        // System.out.println(Status.Success); // Sucess
        // System.out.println(Status.Failed.ordinal()); // 1
        // System.out.println(Status.values()[2]); // Pending 

        Status s = Status.Pending;

        switch (s) {

            case Success:
                System.out.println("It worked.");
                break;
            
            case Failed:
                System.out.println("It didn't work.");
                break;

            case Pending:
                System.out.println("In progress.");
                break;

            case Running:
                System.out.println("Working on it.");
                break;
        
            default:
                System.out.println("Not sure.");
                break;
        }
    }
}