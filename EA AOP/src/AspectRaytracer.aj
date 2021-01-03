public aspect AspectRaytracer {
    void around():call(void RaytracingDemo.traceRays()){
        System.out.println("Starte Raytracing...");
        proceed();
        System.out.println("Raytracing abgeschlossen!");
    }
}