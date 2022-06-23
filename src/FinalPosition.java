public class FinalPosition {
        public  static void main(String[] args){
            position distance = new position();
            double d = distance.finalPosition(-9.81, 10, 0, 0);
            System.out.println(d);

        }
    }

    class position{
        double finalPosition(double a,double t,double Xi, double Vi){
            return  0.5*a*t*t + Vi*t + Xi ;
        }
}
