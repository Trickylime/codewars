public class GrassHopper {

    public static char getGrade(int s1, int s2, int s3) {
        int averageScore = (s1 + s2 + s3)/3;
        if (averageScore >= 90) return 'A';
      if (averageScore >= 80) return 'B';
      if (averageScore >= 70) return 'C';
      if (averageScore >= 60) return 'D';
      else return 'F';
      
        

    }
}