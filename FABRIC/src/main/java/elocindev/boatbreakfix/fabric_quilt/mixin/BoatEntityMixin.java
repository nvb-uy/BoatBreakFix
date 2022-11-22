package elocindev.boatbreakfix.fabric_quilt.mixin;

import net.minecraft.block.BlockState;
import net.minecraft.entity.vehicle.BoatEntity;
import net.minecraft.util.math.BlockPos;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(BoatEntity.class)
public class BoatEntityMixin {
	
	@Inject(at = @At("HEAD"), method = "fall", cancellable = true)
	private void fall(double heightDifference, boolean onGround, BlockState state, BlockPos landedPosition, CallbackInfo info) {
		if (onGround)
			info.cancel();
	}
}