package org.benf.cfr.reader.util.output;

import org.benf.cfr.reader.bytecode.analysis.types.JavaTypeInstance;

/**
 * Created with IntelliJ IDEA.
 * User: lee
 * Date: 20/11/2013
 * Time: 13:05
 */
public class NopSummaryDumper implements SummaryDumper {

    @Override
    public void notify(String message) {
    }

    @Override
    public void notifyError(JavaTypeInstance controllingType, String error) {
    }

    @Override
    public void close() {
    }
}
