/*
 * Copyright (c) 2016 VMware, Inc. All Rights Reserved.
 *
 * This product is licensed to you under the Apache License, Version 2.0 (the "License").
 * You may not use this product except in compliance with the License.
 *
 * This product may include a number of subcomponents with separate copyright notices
 * and license terms. Your use of these subcomponents is subject to the terms and
 * conditions of the subcomponent's license, as noted in the LICENSE file.
 */

package com.vmware.admiral.host;

import com.vmware.admiral.ContainerImageIconService;
import com.vmware.admiral.UiNgService;
import com.vmware.admiral.UiService;
import com.vmware.admiral.UserSessionService;
import com.vmware.xenon.common.ServiceHost;

public class HostInitUiServicesConfig extends HostInitServiceHelper {

    public static void startServices(ServiceHost host) {
        startServices(host, UiService.class, UiNgService.class, UserSessionService.class,
                ContainerImageIconService.class);
        startServices(host, com.vmware.xenon.ui.UiService.class);
    }
}