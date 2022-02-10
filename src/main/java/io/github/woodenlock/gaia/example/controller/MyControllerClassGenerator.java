package io.github.woodenlock.gaia.example.controller;

import io.github.woodenlock.gaia.ModuleTypeCache;
import io.github.woodenlock.gaia.Part;
import io.github.woodenlock.gaia.common.GenerateConst;
import io.github.woodenlock.gaia.generation.AsmUtils;
import io.github.woodenlock.gaia.generation.ClassGenerator;
import io.github.woodenlock.gaia.util.ReflectUtils;
import org.springframework.asm.ClassWriter;

/**
 * 自定义的控制器类信息生成器
 *
 * @author woodenlock
 * @date 2022/1/23 14:35
 */
@SuppressWarnings("unused")
public class MyControllerClassGenerator extends AsmUtils implements ClassGenerator {

    @Override
    public Class<?> apply(Part part) {
        Class<?> entityClass = part.getEntity();
        String voPath = ModuleTypeCache.acquireCanonicalName(entityClass, GenerateConst.Component.VO);


        Class<?> result = null;
        if (null != entityClass && null != voPath) {
            ClassWriter cw = new ClassWriter(0);
            String className = entityClass.getSimpleName() + "Controller";
            String entitySign = getClassBasicSignature(entityClass);
            String voSign = getClassBasicSignature(voPath);
            String fullPath = getFullClassPath(part.getPath(), className);
            String parentClassPath = getClassPath(MyTemplateController.class);
            String sign = String
                .format("L%s<%s%s>;", getClassPath(MyTemplateController.class), entitySign, voSign);
            cw.visit(V1_8, ACC_PUBLIC + ACC_SUPER, fullPath, sign, parentClassPath, null);

            appendControllerAnnotations(cw, entityClass.getSimpleName(), "/api");

            buildNoArgsConstructor(cw, entityClass.getSimpleName() + "Controller", parentClassPath, part.getPath());

            cw.visitEnd();
            byte[] bytes = cw.toByteArray();

            result = ReflectUtils.load(fullPath, bytes, MyTemplateController.class.getClassLoader());
        }

        return result;
    }
}