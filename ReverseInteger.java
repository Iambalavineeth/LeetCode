import java.math.*;

class ReverseInteger {
    public int reverse(int x) {
        if(x == 0)
            return 0;
        int r = 0;
        while(x != 0){
            //Checking for the over-flow of the Integer
            if(r > Integer.MAX_VALUE/10 || r < Integer.MIN_VALUE/10)
                return 0;
            r = r*10 + x%10;
            x /= 10;
        }
        return r;
    }
}
