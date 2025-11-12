//TSNsched uses the Z3 theorem solver to generate traffic schedules for Time Sensitive Networking (TSN)
//
//    TSNsched is licensed under the GNU GPL version 2 or later.
//    
//    You should have received a copy of the GNU General Public License
//    along with this program.  If not, see <https://www.gnu.org/licenses/>.

package com.tsnsched.core;

import com.tsnsched.core.interface_manager.JSONParser;
import com.tsnsched.core.network.*;
import com.tsnsched.core.schedule_generator.*;
import com.tsnsched.core.interface_manager.*;

public class Main {
    
    static void main(String[] args)
    {

        ScheduleGenerator gen = new ScheduleGenerator();
        gen.setParameters(args);
        gen.generateSchedule(args[0]);
    
    }
}
