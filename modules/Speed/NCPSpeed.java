package YourClient.modules.movement; // Change this!!!

import YourClient.events.EventUpdate;    
import YourClient.utils.MovementUtils;

    // If I vaguely remember, there's a tutorial on how to make this on YouTube somewhere.
    public void onUpdate(EventUpdate e) {
        if ((mc.thePlayer.moveForward != 0.0F || mc.thePlayer.moveStrafing != 0.0F) && !mc.thePlayer.isSneaking() && mc.thePlayer.onGround) {
            mc.thePlayer.jump();
        }

        if (mc.thePlayer.isCollidedHorizontally) {
            if (mc.thePlayer.onGround) {
                mc.thePlayer.motionY *= 1.954375734F;
            }
        }
        MovementUtils.strafe();
    }