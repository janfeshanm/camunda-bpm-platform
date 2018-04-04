alter table ACT_RE_DECISION_DEF
    drop FOREIGN KEY ACT_FK_DEC_REQ;

drop index ACT_IDX_DEC_DEF_TENANT_ID on ACT_RE_DECISION_DEF;
drop index ACT_IDX_DEC_DEF_REQ_ID on ACT_RE_DECISION_DEF;
drop index ACT_IDX_DEC_REQ_DEF_TENANT_ID on ACT_RE_DECISION_REQ_DEF;

drop table if exists ACT_RE_DECISION_DEF;
drop table if exists ACT_RE_DECISION_REQ_DEF;
