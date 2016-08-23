// Copyright (c) Microsoft. All rights reserved.
// Licensed under the MIT license. See License.txt in the project root.

package com.microsoft.alm.plugin.idea.tfvc.ui.checkout;

import com.intellij.openapi.project.Project;
import com.intellij.openapi.vcs.CheckoutProvider;
import com.intellij.openapi.vfs.VirtualFile;
import com.microsoft.alm.plugin.context.RepositoryContext;
import com.microsoft.alm.plugin.context.ServerContext;
import com.microsoft.alm.plugin.idea.common.resources.TfPluginBundle;
import com.microsoft.alm.plugin.idea.common.ui.checkout.VcsSpecificCheckoutModel;
import org.apache.commons.lang.StringUtils;

public class TfvcCheckoutModel implements VcsSpecificCheckoutModel {
    @Override
    public void doCheckout(final Project project, final CheckoutProvider.Listener listener,
                           final ServerContext context, final VirtualFile destinationParent,
                           final String directoryName, final String parentDirectory, final boolean isAdvancedChecked) {
        //TODO
    }

    @Override
    public String getTelemetryAction() {
        return "create_workspace";
    }

    @Override
    public String getButtonText() {
        return TfPluginBundle.message(TfPluginBundle.KEY_CHECKOUT_DIALOG_CREATE_WORKSPACE_BUTTON);
    }

    @Override
    public String getRepositoryName(final ServerContext context) {
        return (context != null && context.getTeamProjectReference() != null)
                ? context.getTeamProjectReference().getName() : StringUtils.EMPTY;
    }

    @Override
    public RepositoryContext.Type getRepositoryType() {
        return RepositoryContext.Type.TFVC;
    }
}
