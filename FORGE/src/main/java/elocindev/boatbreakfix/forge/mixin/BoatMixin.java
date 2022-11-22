package elocindev.boatbreakfix.forge.mixin;

import net.minecraft.core.BlockPos;
import net.minecraft.world.entity.vehicle.Boat;
import net.minecraft.world.level.block.state.BlockState;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(Boat.class)
public class BoatMixin {
	
	@Inject(at = @At("HEAD"), method = "checkFallDamage", cancellable = true)
	private void checkFallDamage(double p_38307_, boolean p_38308_, BlockState p_38309_, BlockPos p_38310_, CallbackInfo info) {
		if (p_38308_)
			info.cancel();
	}
}