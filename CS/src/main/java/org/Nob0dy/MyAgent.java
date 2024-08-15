package org.Nob0dy;

import javassist.ClassPool;
import javassist.CtClass;
import javassist.CtMethod;
import java.lang.instrument.ClassFileTransformer;
import java.lang.instrument.Instrumentation;
import java.security.ProtectionDomain;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class MyAgent {
    static String targetClassName0 = "beacon/BeaconPayload";
    static String targetMethodName0 = "exportBeaconStage";
    static String filePath0 = ".\\CodeFile0.java";

    static String targetClassName1 = "pe/MalleablePE";
    static String targetMethodName1 = "process";
    static String filePath1 = ".\\CodeFile1.java";

    private static String readCodeFromFile(String filePath) throws IOException {
        StringBuilder code = new StringBuilder();
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                code.append(line).append("\n");
            }
        }
        return code.toString();
    }

    public static void premain(String agentArgs, Instrumentation inst) {
        System.out.println("[*]agnet success!");
        inst.addTransformer(new MyTransformer());
    }

    public static class MyTransformer implements ClassFileTransformer {
        @Override
        public byte[] transform(ClassLoader loader, String className, Class<?> classBeingRedefined, ProtectionDomain protectionDomain, byte[] classfileBuffer) {
            if (targetClassName0.equals(className.replace('.', '/'))) {
                System.out.println("[*]find beacon/BeaconPayload");
                try {
                    ClassPool classPool = ClassPool.getDefault();
                    CtClass ctClass = classPool.get(className.replace('/', '.'));

                    CtClass[] paramTypes = { CtClass.intType, classPool.get("java.lang.String"), CtClass.booleanType, CtClass.booleanType, classPool.get("java.lang.String"), classPool.get("java.lang.String")};
                    CtMethod method = ctClass.getDeclaredMethod(targetMethodName0, paramTypes);
                    System.out.println("[*]find exportBeaconStage");

                    String codeFromFile = readCodeFromFile(filePath0);
                    method.insertAfter(codeFromFile, true);
                    return ctClass.toBytecode();

                } catch (Exception e) {
                    e.printStackTrace();
                }
            }else if (targetClassName1.equals(className.replace('.', '/'))) {
                System.out.println("[*]find pe/MalleablePE");
                try {
                    ClassPool classPool = ClassPool.getDefault();
                    CtClass ctClass = classPool.get(className.replace('/', '.'));

                    CtClass[] paramTypes = { classPool.get("byte[]"),  classPool.get("java.lang.String")};
                    CtMethod method = ctClass.getDeclaredMethod(targetMethodName1, paramTypes);
                    System.out.println("[*]find process");

                    String codeFromFile = readCodeFromFile(filePath1);
                    method.insertAfter(codeFromFile, true);
                    return ctClass.toBytecode();

                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
            return classfileBuffer;
        }
    }
}
