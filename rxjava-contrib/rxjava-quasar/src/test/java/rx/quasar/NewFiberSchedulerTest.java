/**
 * Copyright 2014 Netflix, Inc.
 * <p>
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * <p>
 * http://www.apache.org/licenses/LICENSE-2.0
 * <p>
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package rx.quasar;

import org.junit.Rule;
import org.junit.rules.TestRule;
import org.junit.rules.Timeout;
import rx.Scheduler;
import rx.schedulers.AbstractSchedulerConcurrencyTests;

public class NewFiberSchedulerTest extends AbstractSchedulerConcurrencyTests {
//    @Rule
//    public TestRule globalTimeout = new Timeout(20000);

    @Override
    protected Scheduler getScheduler() {
        return NewFiberScheduler.getDefaultInstance();
    }
}