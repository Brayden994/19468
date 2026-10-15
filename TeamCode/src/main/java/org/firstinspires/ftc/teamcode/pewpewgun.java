//package org.firstinspires.ftc.teamcode;
//import com.qualcomm.robotcore.eventloop.opmode.OpMode;
//import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
//import com.qualcomm.robotcore.hardware.DcMotor;
//import com.qualcomm.robotcore.util.ElapsedTime;
//
//
//public class shooterCode extends OpMode{
//    DcMotor shooterMotor;
//    DcMotor indexingMotor;
//
//
//
//    @Override
//    public void init() {
//        shooterMotor = hardwareMap.get(DcMotor.class, "shooterMotor");
//        indexingMotor = hardwareMap.get(DcMotor.class, "indexingMotor");
//    }
//    @Override
//    public void loop() {
//        if (gamepad1.right_trigger >= 0.1) {
//            shooterMotor.setPower(1);
//            indexingMotor.setPower(0.5);
//        }
//        else {
//            indexingMotor.setPower(0);
//            shooterMotor.setPower(0);
//        }
//    }
//}
