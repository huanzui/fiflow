package com.github.myetl.fiflow.core.sql.builder;

import com.github.myetl.fiflow.core.core.FiflowSqlSession;
import com.github.myetl.fiflow.core.sql.Cmd;
import com.github.myetl.fiflow.core.sql.CmdBuildInfo;
import com.github.myetl.fiflow.core.sql.CmdBuilder;

/**
 * alter table
 */
public class AlterTableBuilder extends CmdBaseBuilder implements CmdBuilder {
    public static final String pattern = "(ALTER\\s+TABLE\\s+.*)";

    public AlterTableBuilder() {
        super(pattern);
    }

    @Override
    public CmdBuildInfo build(Cmd cmd, FiflowSqlSession session) {
        return null;
    }
}
