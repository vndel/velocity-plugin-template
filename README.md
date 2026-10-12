# velocity-plugin-template

Small Velocity 3 starter focused on lifecycle ownership and non-blocking proxy work. Bukkit/Paper APIs are intentionally absent: proxy plugins should communicate with backends through explicit messages or shared services.

## Build
Java 21 and Gradle are required. Run `./gradlew build` and copy the jar from `build/libs/` to Velocity's `plugins/` directory.

## Operating guidance
Keep event handlers short, bound executor queues, and close clients/executors during shutdown. Do not block the proxy event loop on database or remote API calls. Test reconnect and broker outage behavior before deployment. MIT licensed.
