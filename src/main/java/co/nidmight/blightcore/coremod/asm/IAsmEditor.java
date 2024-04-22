package co.nidmight.blightcore.coremod.asm;

import org.objectweb.asm.tree.MethodNode;

public interface IAsmEditor {

    void edit(MethodNode method);

    String getClassName();

    String getMethodName();

    String getMethodDesc();
}