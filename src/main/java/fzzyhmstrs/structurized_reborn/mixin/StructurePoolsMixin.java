package fzzyhmstrs.structurized_reborn.mixin;

import net.minecraft.structure.pool.StructurePools;
import org.spongepowered.asm.mixin.Mixin;

@Mixin(StructurePools.class)
public class StructurePoolsMixin {
    // Left empty intentionally. The previous implementation caused registry-related crashes.
    // The correct logic is now handled in RegistryLoaderMixin.
}
