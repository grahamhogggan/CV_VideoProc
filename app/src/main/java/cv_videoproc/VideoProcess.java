package cv_videoproc;
import org.opencv.core.Mat;
import org.opencv.imgproc.*;
import org.opencv.core.Rect;
import org.opencv.core.Scalar;
import org.opencv.core.Point;
public class VideoProcess {
    public VideoProcess()
    {

    }
    public Mat process(Mat input)
    {
        return input;
    }
    public Mat appProcess(Mat input)
    {
        if(App.capturing)
        Imgproc.putText(input, "Capturing", new Point(50,50), 0, 1 , new Scalar(0,0,0,0),2);
        return input;
    }
}
