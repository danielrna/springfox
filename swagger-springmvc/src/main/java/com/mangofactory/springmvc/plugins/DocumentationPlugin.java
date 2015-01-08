package com.mangofactory.springmvc.plugins;

import com.mangofactory.schema.plugins.DocumentationType;
import org.springframework.plugin.core.Plugin;

public interface DocumentationPlugin extends Plugin<DocumentationType> {
  boolean isEnabled();

  String getName();

  DocumentationContext build(DocumentationContextBuilder builder);
}
