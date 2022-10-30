package handlers;

import common.Type;

/**
 * Used as a fallback in approval chain.
 * Should not contain any additional logic.
 * If abstract methods are changed, be free to edit signatures.
 */
public class ExecutiveMeeting extends Approver {
    private static final ExecutiveMeeting INSTANCE = new ExecutiveMeeting();

    public static ExecutiveMeeting getInstance() {
        return INSTANCE;
    }

    @Override
    public void approve(int id, double cost, Type type) {
        if (canApprove(id, cost, type)) {
            System.out.println("Executive Meeting approved purchase with id " + id + " that costs " + cost);
        }


    }

    @Override
    protected boolean canApprove(int id, double cost, Type type) {
        boolean result = false;

        switch (type) {
            case CONSUMABLES:
                if (cost > 1000) {
                    return result = true;
                } else {
                    break;
                }
            case CLERICAL:
                if (cost > 2000) {
                    return result = true;
                } else {
                    break;
                }
            case GADGETS:
                if (cost > 3000) {
                    return result = true;
                } else {
                    break;
                }
            case GAMING:
                if (cost > 5000) {
                    return result = true;
                } else {
                    break;
                }
            case PC:
                if (cost > 8000) {
                    return result = true;
                } else {
                    break;
                }
            default:
                return false;


        }

return false;
    }
}