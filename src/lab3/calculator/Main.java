package lab3.calculator;

import javafx.scene.paint.LinearGradientBuilder;

public class Main<y> {
    public static void main(String[] args) {
        LogicalOp op = new LogicalOp();
        System.out.println("The bigger number is : " + op.checkBiggerNumber(5, 8));
        LogicalOp compare = new LogicalOp();
        System.out.println(compare.checkText("Learning text comparison", "Got to try some more"));
        LogicalOp ss = new LogicalOp();
        System.out.println(ss.check("ItFast ", "FastTrackIT"));
        LogicalOp rh = new LogicalOp();
        System.out.println(rh.snow());
        LogicalOp gear = new LogicalOp();
        System.out.println(gear.big());
        LogicalOp rr = new LogicalOp();
        System.out.println(rr.number(4));
        LogicalOp is = new LogicalOp();
        System.out.println(is.isNumberEven());
        LogicalOp vot = new LogicalOp();
        System.out.println(vot.isEligibleToVote());
        LogicalOp hi = new LogicalOp();
        System.out.println(hi.bigger());

    }


}

