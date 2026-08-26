package com.exemplo.superfurnace.mixin;

import net.minecraft.block.entity.AbstractFurnaceBlockEntity;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(AbstractFurnaceBlockEntity.class)
public class AbstractFurnaceBlockEntityMixin {

    // Divide o tempo de fundição por 4 (troque o 4 pra ajustar a velocidade)
    @Inject(method = "getCookTime", at = @At("RETURN"), cancellable = true)
    private static void superfurnace$velocidade4x(CallbackInfoReturnable<Integer> cir) {
        cir.setReturnValue(Math.max(1, cir.getReturnValue() / 4));
    }
}
