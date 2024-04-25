import com.google.gson.Gson;

public class Driver {


    public static void main(String[] args) {

        System.out.println("Hello");
        String data = """
                {
                   "name": "Rickshaw Carry",
                   "type": "strongman",
                   "muscle": "forearms",
                   "equipment": "other",
                   "difficulty": "beginner",
                   "instructions": "Position the frame at the starting point, and load with the appropriate weight. Standing in the center of the frame, begin by gripping the handles and driving through your heels to lift the frame. Ensure your chest and head are up and your back is straight. Immediately begin walking briskly with quick, controlled steps. Keep your chest up and head forward, and make sure you continue breathing. Bring the frame to the ground after you have reached the end point."
                 }""";

        // Show me this parses
        // Be sure you submit all of your supporting classes as well
        // This is all I need!
        Gson gson = new Gson();
        Exercise e = gson.fromJson(data, Exercise.class);
        System.out.println(e);


    }

}
