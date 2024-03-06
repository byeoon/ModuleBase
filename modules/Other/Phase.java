package YourClient.modules.other;

import net.minecraft.network.play.client.C03PacketPlayer;
// Basic phase, will not bypass anticheats due to simplicity.

public void onEnable() {
    super.onEnable();
    mc.thePlayer.setPosition(mc.thePlayer.posX, mc.thePlayer.posY - 2.0D, mc.thePlayer.posZ);
    mc.thePlayer.sendQueue.addToSendQueue(new C03PacketPlayer.C04PacketPlayerPosition(mc.thePlayer.posX, mc.thePlayer.posY - 2.0D, mc.thePlayer.posZ, true));
}