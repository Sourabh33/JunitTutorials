package com.example.junit5.suites;

import org.junit.platform.suite.api.IncludeTags;
import org.junit.platform.suite.api.SelectPackages;
import org.junit.platform.suite.api.Suite;

@Suite
@SelectPackages({"com.example.junit5.basicexample"})
@IncludeTags("PROD")
public class ProdTagSuite {
}
