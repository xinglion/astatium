/**
 * Copyright 2016 Phillip DuLion
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.dulion.astatium.camel.bridge.component;

import org.apache.camel.Endpoint;
import org.apache.camel.Processor;
import org.apache.camel.ShutdownRunningTask;
import org.apache.camel.SuspendableService;
import org.apache.camel.impl.DefaultConsumer;
import org.apache.camel.spi.ShutdownAware;

public class BridgeConsumer extends DefaultConsumer implements ShutdownAware, SuspendableService {

	public BridgeConsumer(Endpoint endpoint, Processor processor) {
		super(endpoint, processor);
	}
	
	@Override
	public BridgeEndpoint getEndpoint() {
		return (BridgeEndpoint) super.getEndpoint();
	}
	
	@Override
	protected void doStart() throws Exception {
		getEndpoint().setConsumer(this);
	}
	
	@Override
	protected void doStop() throws Exception {
		getEndpoint().setConsumer(null);
	}
	
	@Override
	protected void doSuspend() throws Exception {
		doStop();
	}
	
	@Override
	protected void doResume() throws Exception {
		doStart();
	}

	@Override
	public boolean deferShutdown(ShutdownRunningTask shutdownRunningTask) {
		return true;
	}

	@Override
	public int getPendingExchangesSize() {
		return 0;
	}

	@Override
	public void prepareShutdown(boolean suspendOnly, boolean forced) {
		// Do nothing
	}

}
