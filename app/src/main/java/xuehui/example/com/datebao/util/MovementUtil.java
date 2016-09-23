package xuehui.example.com.datebao.util;

import android.graphics.Point;

/**
 * Created by xuehui on 16-9-24.
 */
public class MovementUtil {

    int getAngle(Point pointOrigin, Point pointNow) {
        int x = Math.abs(pointOrigin.x - pointNow.x);
        int y = Math.abs(pointOrigin.y - pointNow.y);
        double z = Math.sqrt(x * x + y * y);
        int angle = Math.round((float) (Math.asin((y / z) / Math.PI * 180)));

        return angle;
    }

    public static class Movement{
        boolean clockwise;
        boolean moveUp;
        boolean moveRight;
    }
}
