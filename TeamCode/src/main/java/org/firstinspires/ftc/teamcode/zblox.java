//package org.firstinspires.ftc.teamcode;
//import com.qualcomm.robotcore.eventloop.opmode.OpMode;
//import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
//import com.qualcomm.robotcore.hardware.DcMotor;
//
//public class Intake extends OpMode{
//    DcMotor intakeMotor;
//
//    @Override
//    public void init() {
//        intakeMotor = hardwareMap.get(DcMotor.class, "intakeMotor");
//
//    }
//    @Override
//    public void loop() {
//        if (gamepad1.left_trigger >= 0.1) {
//            intakeMotor.setPower(0.5);
//        }
//        else {
//            intakeMotor.setPower(0);
//        }
//
//    }
//}
