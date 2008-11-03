package com.atlassian.maven.plugin.clover.internal;

import java.util.Map;
import java.util.Set;

/**
 */
public interface CompilerConfiguration extends CloverConfiguration {

    Set getIncludes();

    Set getExcludes();

    boolean includesAllSourceRoots();    

    String getJdk();

    String getFlushPolicy();

    int getFlushInterval();

    boolean isUseFullyQualifiedJavaLang();

    String getEncoding();

    Map getMethodContexts();

    Map getStatementContexts();


}