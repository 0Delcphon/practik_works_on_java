package praktika_twelve;

public class StudentNotFoundException extends Exception
{
    public StudentNotFoundException(String errMsg)
    {
        super(errMsg);
    }
}