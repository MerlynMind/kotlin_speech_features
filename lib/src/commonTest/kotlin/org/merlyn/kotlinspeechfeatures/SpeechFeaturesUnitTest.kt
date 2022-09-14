package org.merlyn.kotlinspeechfeatures

import kotlin.test.Test
import kotlin.test.assertContentEquals
import kotlin.test.assertEquals


class SpeechFeaturesUnitTest {
    private val speechFeatures = SpeechFeatures()
    private val testSignal = FloatArray(1000)
        .mapIndexed { index, _ -> index.toFloat()}
        .toFloatArray()

    @Test
    fun testSsc() {
        // Execute
        val actual = speechFeatures.ssc(testSignal)

        // Create expected outcome
        val expected = arrayOf(
            arrayOf(44.73627f, 123.83546f, 206.88138f, 307.85553f, 398.35855f, 503.13364f, 619.14575f, 753.69824f, 898.3493f, 1065.7552f, 1242.4453f, 1439.6106f, 1647.3676f, 1877.7385f, 2126.1042f, 2405.894f, 2708.1516f, 3041.537f, 3405.1182f, 3810.8975f, 4258.0645f, 4747.708f, 5290.3657f, 5885.009f, 6533.4165f, 7243.445f).toFloatArray(),
            arrayOf(48.996117f, 117.92084f, 209.76749f, 314.68475f, 389.9298f, 502.64282f, 622.96155f, 754.72705f, 896.8609f, 1066.452f, 1244.3834f, 1439.4885f, 1646.5734f, 1880.2286f, 2124.9077f, 2406.0193f, 2708.135f, 3040.9202f, 3403.9648f, 3810.441f, 4258.674f, 4748.7466f, 5290.6143f, 5884.247f, 6532.154f, 7244.3745f).toFloatArray(),
            arrayOf(50.845924f, 115.256905f, 210.76952f, 317.95377f, 386.4862f, 502.31082f, 624.48004f, 755.20526f, 896.3275f, 1066.8607f, 1245.1633f, 1439.4254f, 1646.1827f, 1881.221f, 2124.59f, 2405.9558f, 2707.9773f, 3040.7517f, 3403.732f, 3810.2722f, 4258.759f, 4748.985f, 5290.709f, 5884.0474f, 6531.851f, 7244.5864f).toFloatArray(),
            arrayOf(51.744934f, 113.929825f, 211.22664f, 319.59418f, 384.8425f, 502.15793f, 625.2019f, 755.43475f, 896.0754f, 1067.0532f, 1245.5334f, 1439.3956f, 1645.9996f, 1881.694f, 2124.44f, 2405.9248f, 2707.903f, 3040.672f, 3403.6208f, 3810.1921f, 4258.799f, 4749.0977f, 5290.754f, 5883.9556f, 6531.7095f, 7244.6846f).toFloatArray(),
            arrayOf(45.465588f, 139.56871f, 202.58215f, 299.28342f, 394.8389f, 503.24673f, 619.6667f, 749.5609f, 897.2519f, 1069.0369f, 1238.4788f, 1438.0552f, 1649.4956f, 1877.6006f, 2126.3804f, 2405.8809f, 2708.0588f, 3040.3005f, 3404.6714f, 3811.1309f, 4258.6343f, 4748.794f, 5290.047f, 5885.0015f, 6532.5293f, 7243.27f).toFloatArray()
        )

        // Assert
        assert2DArrayEquals(expected, actual)
    }

    @Test
    fun testMfcc() {
        // Execute
        val actual = speechFeatures.mfcc(testSignal)

        // Create expected outcome
        val expected = arrayOf(
            arrayOf(9.884642f, 20.11851f, 12.654804f, 10.700911f, 10.135674f, 9.257292f, 9.017368f, 7.7304034f, 6.7583146f, 5.423549f, 4.9549828f, 3.9876044f, 3.2118719f).toFloatArray(),
            arrayOf(10.851788f, 20.036625f, 12.54133f, 10.552486f, 9.973658f, 9.107553f, 8.917737f, 7.662798f, 6.7817287f, 5.446472f, 5.0057297f, 3.9493818f, 3.0075786f).toFloatArray(),
            arrayOf(11.513288f, 19.998482f, 12.488712f, 10.487105f, 9.903165f, 9.045981f, 8.880149f, 7.645392f, 6.7970176f, 5.465127f, 5.0218983f, 3.9308274f, 2.9294753f).toFloatArray(),
            arrayOf(12.012865f, 19.979448f, 12.462683f, 10.455052f, 9.869176f, 9.016853f, 8.863178f, 7.638394f, 6.8055706f, 5.47534f, 5.0308967f, 3.9230769f, 2.8929975f).toFloatArray(),
            arrayOf(12.215783f, 20.040632f, 12.5157585f, 10.491642f, 9.878624f, 8.979987f, 8.762049f, 7.5403495f, 6.7668257f, 5.6135473f, 5.3601904f, 4.616151f, 4.091453f).toFloatArray()
        )

        // Assert
        assert2DArrayEquals(expected, actual)
    }

    @Test
    fun testFbank() {
        // Execute
        val actual = speechFeatures.fbank(testSignal)

        // Create expected outcome
        val expectedFeatures = arrayOf(
            arrayOf(2298.921f, 311.10876f, 152.31285f, 67.12247f, 39.30207f, 30.05849f, 22.423935f, 16.935686f, 13.367105f, 10.5317135f, 8.427468f, 6.8634996f, 5.7147827f, 4.7585073f, 4.251337f, 3.7752802f, 3.2025096f, 2.87203f, 2.6774952f, 2.4040322f, 2.2447147f, 2.113212f, 1.9997597f, 1.9740891f, 1.932159f, 1.9828026f).toFloatArray(),
            arrayOf(4555.343f, 596.0519f, 335.78638f, 126.56891f, 80.55956f, 65.094734f, 46.05628f, 34.20999f, 27.717323f, 21.930403f, 17.402672f, 13.871628f, 12.066126f, 9.681951f, 8.787187f, 7.8131785f, 6.582346f, 5.9373655f, 5.518313f, 4.9751644f, 4.6319866f, 4.3614173f, 4.1222634f, 4.0702105f, 3.9896345f, 4.101569f).toFloatArray(),
            arrayOf(7973.882f, 1026.2181f, 613.5945f, 216.85925f, 142.73843f, 118.170494f, 81.84967f, 60.37613f, 49.440704f, 39.18794f, 30.944258f, 24.517994f, 21.648146f, 17.160126f, 15.643236f, 13.919025f, 11.7027445f, 10.582053f, 9.815584f, 8.864576f, 8.243759f, 7.7665186f, 7.3348336f, 7.2446985f, 7.1026573f, 7.3057585f).toFloatArray(),
            arrayOf(12551.655f, 1602.2545f, 985.60834f, 337.7675f, 226.00249f, 189.24414f, 129.78133f, 95.41541f, 78.53052f, 62.297752f, 49.07801f, 38.77438f, 34.479446f, 27.174042f, 24.824114f, 22.09533f, 18.55945f, 16.801722f, 15.570019f, 14.072816f, 13.080274f, 12.326333f, 11.636815f, 11.495716f, 11.271474f, 11.596551f).toFloatArray(),
            arrayOf(19662.998f, 2045.6187f, 1197.8574f, 560.8656f, 327.6491f, 249.34653f, 175.75566f, 136.32768f, 112.83582f, 82.361435f, 68.0235f, 56.523926f, 45.990047f, 38.30514f, 34.44046f, 30.48569f, 25.894846f, 23.13611f, 21.757648f, 19.363194f, 18.220253f, 17.02291f, 16.174576f, 15.957283f, 15.595274f, 16.065346f).toFloatArray()
        )
        val expectedEnergy = arrayOf(19626.613f, 51626.34f, 100036.21f, 164862.12f, 201951.56f).toFloatArray()

        // Assert
        assert2DArrayEquals(expectedFeatures, actual.features)
        assertContentEquals(expectedEnergy, actual.energy)
    }

    @Test
    fun testLogFbank() {
        // Execute
        val actual = speechFeatures.logfbank(testSignal)

        // Create expected outcome
        val expected = arrayOf(
            arrayOf(7.7401953f, 5.7401423f, 5.0259366f, 4.2065187f, 3.6712773f, 3.403145f, 3.1101289f, 2.829423f, 2.5927968f, 2.354391f, 2.1314964f, 1.9262174f, 1.7430563f, 1.559934f, 1.4472336f, 1.3284746f, 1.1639347f, 1.0550191f, 0.98488176f, 0.87714744f, 0.80857843f, 0.7482091f, 0.693027f, 0.6801071f, 0.658638f, 0.6845113f).toFloatArray(),
            arrayOf(8.424056f, 6.390328f, 5.8164754f, 4.840787f, 4.3889966f, 4.1758437f, 3.829864f, 3.5325177f, 3.3220577f, 3.087874f, 2.8566236f, 2.6298456f, 2.490402f, 2.2702634f, 2.1732945f, 2.055812f, 1.8843912f, 1.7812655f, 1.7080722f, 1.6044585f, 1.5329858f, 1.472797f, 1.4164023f, 1.4036947f, 1.3836997f, 1.4113697f).toFloatArray(),
            arrayOf(8.983927f, 6.9336357f, 6.4193344f, 5.3792486f, 4.961014f, 4.7721286f, 4.4048843f, 4.100594f, 3.900774f, 3.668369f, 3.4321876f, 3.1994073f, 3.0749197f, 2.8425884f, 2.7500386f, 2.6332567f, 2.4598234f, 2.3591595f, 2.2839713f, 2.182063f, 2.1094565f, 2.049822f, 1.9926348f, 1.9802699f, 1.960469f, 1.9886628f).toFloatArray(),
            arrayOf(9.437608f, 7.379167f, 6.893259f, 5.8223577f, 5.420546f, 5.2430377f, 4.865851f, 4.55824f, 4.3634872f, 4.1319256f, 3.8934112f, 3.6577597f, 3.5403633f, 3.302262f, 3.2118156f, 3.0953662f, 2.920979f, 2.8214815f, 2.7453473f, 2.644245f, 2.5711052f, 2.5117378f, 2.4541738f, 2.4419744f, 2.422275f, 2.4507077f).toFloatArray(),
            arrayOf(9.886494f, 7.6234555f, 7.0882897f, 6.329481f, 5.791943f, 5.5188437f, 5.1690946f, 4.9150615f, 4.725934f, 4.411117f, 4.2198534f, 4.034664f, 3.828425f, 3.645584f, 3.539232f, 3.4172573f, 3.254044f, 3.1413946f, 3.0799654f, 2.9633741f, 2.9025338f, 2.83456f, 2.7834406f, 2.7699153f, 2.746968f, 2.7766645f).toFloatArray()
        )

        // Assert
        assert2DArrayEquals(expected, actual)
    }

    private fun assert2DArrayEquals(expected: Array<FloatArray>, actual: Array<FloatArray>) {
        assertEquals(expected.size, actual.size)
        expected.forEachIndexed { index, expectedArr ->
            assertContentEquals(expectedArr, actual[index])
        }
    }

}