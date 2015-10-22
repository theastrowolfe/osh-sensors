/***************************** BEGIN LICENSE BLOCK ***************************

The contents of this file are subject to the Mozilla Public License, v. 2.0.
If a copy of the MPL was not distributed with this file, You can obtain one
at http://mozilla.org/MPL/2.0/.

Software distributed under the License is distributed on an "AS IS" basis,
WITHOUT WARRANTY OF ANY KIND, either express or implied. See the License
for the specific language governing rights and limitations under the License.
 
Copyright (C) 2012-2015 Sensia Software LLC. All Rights Reserved.
 
******************************* END LICENSE BLOCK ***************************/

package org.sensorhub.impl.sensor.plume;

import org.sensorhub.api.module.IModule;
import org.sensorhub.api.module.IModuleProvider;
import org.sensorhub.api.module.ModuleConfig;



public class PlumeModuleDescriptor implements IModuleProvider
{

    @Override
    public String getModuleName()
    {
        return "PlumeModel";
    }


    @Override
    public String getModuleDescription()
    {
        return "SensorHub driver for tasking and serving data output by the Lagrangian Plume moderl developed at University of Alabama in Huntsville ";
    }


    @Override
    public String getModuleVersion()
    {
        return "0.1";
    }


    @Override
    public String getProviderName()
    {
        return "Botts Inc.";
    }


    @Override
    public Class<? extends IModule<?>> getModuleClass()
    {
        return PlumeSensor.class;
    }


    @Override
    public Class<? extends ModuleConfig> getModuleConfigClass()
    {
        return PlumeConfig.class;
    }

}