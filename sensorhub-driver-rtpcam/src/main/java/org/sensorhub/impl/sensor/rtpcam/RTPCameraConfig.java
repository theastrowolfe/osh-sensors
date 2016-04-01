/***************************** BEGIN LICENSE BLOCK ***************************

The contents of this file are subject to the Mozilla Public License, v. 2.0.
If a copy of the MPL was not distributed with this file, You can obtain one
at http://mozilla.org/MPL/2.0/.

Software distributed under the License is distributed on an "AS IS" basis,
WITHOUT WARRANTY OF ANY KIND, either express or implied. See the License
for the specific language governing rights and limitations under the License.
 
Copyright (C) 2012-2015 Sensia Software LLC. All Rights Reserved.
 
******************************* END LICENSE BLOCK ***************************/

package org.sensorhub.impl.sensor.rtpcam;

import org.sensorhub.api.config.DisplayInfo;
import org.sensorhub.api.sensor.SensorConfig;
import org.sensorhub.impl.comm.TCPConfig;
import org.sensorhub.impl.sensor.videocam.BasicVideoConfig;
import org.sensorhub.impl.sensor.videocam.VideoResolution;


/**
 * <p>
 * Configuration class for the generic RTP/RTSP camera driver
 * </p>
 *
 * @author Alex Robin <alex.robin@sensiasoftware.com>
 * @since Dec 12, 2015
 */
public class RTPCameraConfig extends SensorConfig
{    
    @DisplayInfo(label="Camera ID", desc="Camera ID to be appended to UID prefix")
    public String cameraID;
    
    @DisplayInfo(label="Video", desc="Video settings")
    public VideoConfig video = new VideoConfig();
    
    @DisplayInfo(label="Network", desc="Network configuration")
    public TCPConfig net = new TCPConfig();
    
    @DisplayInfo(label="RTP/RTSP", desc="RTP/RTSP configuration")
    public RTSPConfig rtsp = new RTSPConfig();
    
    
    public class VideoConfig extends BasicVideoConfig
    {
        @DisplayInfo(desc="Frame width in pixels")
        public int frameWidth;
        
        @DisplayInfo(desc="Frame height in pixels")
        public int frameHeight;
        
        public VideoResolution getResolution()
        {
            return new VideoResolution()
            {
                public int getWidth() { return frameWidth; };
                public int getHeight() { return frameHeight; };
            };
        }
    }
    
    
    public RTPCameraConfig()
    {
        video.frameWidth = 1280;
        video.frameHeight = 720;
    }
}
