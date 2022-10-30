import common.Type;
import handlers.Approver;
import handlers.Manager;

/**
 * Execution class of the application.
 * Be free to modify below line 14 (bellow comment line)
 */
public class PurchaseApprovalExecutor {

    public static void execute() {
        Approver manager = new Manager();
        ApprovalChainGenerator.generate(manager);
        //Be free to modify method below this line

        manager.approve(1, 15000, Type.CONSUMABLES);
        manager.approve(2, 5000, Type.PC);
        manager.approve(3, 5000, Type.PC);
        manager.approve(4, 3000, Type.CLERICAL);
        manager.approve(5, 5500, Type.GADGETS);
        manager.approve(6, 2000, Type.GAMING);
        manager.approve(7, 750, Type.CONSUMABLES);
        manager.approve(8, 4000, Type.PC);
        manager.approve(9, 400, Type.CLERICAL);
        manager.approve(10, 1200, Type.CONSUMABLES);
        manager.approve(11, 5000, Type.GAMING);
        manager.approve(12, 600, Type.CLERICAL);
        manager.approve(13, 6000, Type.GAMING);
        manager.approve(14, 12000, Type.PC);


    }
}
