public class Mass {

    public static void main(String[] args) {
        System.out.println(BMI("205 pounds", "73 inches"));
    }

    /** Метод, измеряющий индекс массы тела **/
    public static String BMI(String weight, String height)
    {
        double koefkilToP = 2.20462;
        double koefMetToInch = 39.3701;
        String[] sweight = weight.split(" ");
        String[] sheight = height.split(" ");
        double weightNum = Double.parseDouble(sweight[0]);
        double heightNum = Double.parseDouble(sheight[0]);
        if (sweight[1].equals("pounds")) weightNum = weightNum / koefkilToP;
        if (sheight[1].equals("inches")) heightNum = heightNum / koefMetToInch;
        double result = Math.round(weightNum / heightNum / heightNum);
        if (result < 18.5) return (result) + " Underweight";
        else if (result < 25) return (result) + " Normal weight";
        else return (result) + " Overweight";
    }
}
