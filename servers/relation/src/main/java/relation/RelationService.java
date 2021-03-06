package relation;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class RelationService
{
    public static Context context;
    public static void main( String[] args )
    {
        context = new Context();
        context.init(args);
        context.start();
        log.warn("RelationService启动成功...");
    }
}
