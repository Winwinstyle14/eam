package vhc.smartw.eam.definition;

import vhc.smartw.eam.converter.IDbValue;

public enum WoStatus implements IDbValue<Integer> {
    UNRELEASED(1),
    RELEASED(3),
    COMPLETE(4),
    COMPLETE_NO_CHARGES(5),
    ON_HOLD(6),
    CANCELLED(7),
    CLOSED(12),
    PENDING_CLOSE(14),
    FAILED_CLOSE(15),
    DRAFT(17),
    CANCELLED_BY_PM(98),
    CANCELLED_BY_APPROVER(99),
    WAIT_TO_CREATE_CR(1001),
    WAITING_FOR_ASSIGNMENT(1002);

    final Integer dbVal;

    WoStatus(final Integer dbVal) {
        this.dbVal = dbVal;
    }

    @Override
    public Integer getDbVal() {
        return dbVal;
    }
}
