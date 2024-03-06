package YourClient.modules.movement; // Change this!!!

import YourClient.events.EventPreUpdate;
import YourClient.events.EventUpdate;
import YourClient.utils.MovementUtils;
import YourClient.utils.TimeUtil;
import net.minecraft.network.play.client.C03PacketPlayer;

/* 
    1BPS Verus Fly
    Still working as of 3/6/24
*/

  private TimeUtil timeUtil = new TimeUtil();

    public void onUpdate(EventUpdate e)
    {
        MovementUtils.setMotion(MovementUtils.defaultSpeed()); // sets player to default speed
    	mc.thePlayer.motionY = 0; 
        if (timeUtil.hasTimePassed(300))
        {
            mc.timer.timerSpeed = 0.40F; // Change the timer speed to 0.40
            if (timeUtil.hasTimePassed(1800))
            {
                mc.timer.timerSpeed = 1.15F; // Change the timer speed to 1.15 
            }
            if (timeUtil.hasTimePassed(2000))
            {
                timeUtil.reset(); // Reset the clock
            }

        }
    }

     public void onMotion (EventPreUpdate eventMotion)
        {
                mc.getNetHandler().addToSendQueue(new C03PacketPlayer(true)); // Sends packet that tells the server you are on the ground
                this.mc.thePlayer.cameraYaw = 0.080F; // headbobbing
        }